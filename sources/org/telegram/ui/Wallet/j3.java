package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
public final class j3 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final a5 f33059a;

    public j3(a5 a5Var) {
        this.f33059a = a5Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        a5 a5Var = this.f33059a;
        a5Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            a5Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f33059a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f33059a.W((m61) obj, (View) obj2);
    }
}
