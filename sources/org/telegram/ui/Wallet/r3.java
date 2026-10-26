package org.telegram.ui.Wallet;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t61;
public final class r3 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final m5 f37159a;

    public r3(m5 m5Var) {
        this.f37159a = m5Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        m5 m5Var = this.f37159a;
        m5Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            m5Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(this.f37159a.Y((t61) obj, (View) obj2));
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f37159a.X((t61) obj, (View) obj2);
    }
}
