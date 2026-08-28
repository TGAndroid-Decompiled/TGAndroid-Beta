package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.ui.Components.UndoView;
public final class jv implements org.telegram.ui.Components.vp0, org.telegram.ui.Components.nk0, org.telegram.ui.Components.ok0, w00, org.telegram.ui.ActionBar.b2, r0.o, org.telegram.ui.Components.ck0 {
    public final int f39633a;
    public final dy f39634b;

    public jv(dy dyVar, int i9) {
        this.f39633a = i9;
        this.f39634b = dyVar;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        UndoView[] undoViewArr;
        dy dyVar = this.f39634b;
        dyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        dyVar.f37637b4 = defaultWindowInsets.f10849b;
        dyVar.f37643c4 = defaultWindowInsets.d;
        int i9 = m1Var.f46929a.f(8).d;
        if (dyVar.f37648d4 != i9) {
            dyVar.f37648d4 = i9;
            dyVar.fragmentView.requestLayout();
        }
        dyVar.B0.setPadding(0, dyVar.f37637b4, 0, 0);
        dyVar.X4();
        for (UndoView undoView : dyVar.f37731u0) {
            if (undoView != null) {
                int i10 = dyVar.f37643c4 + dyVar.f37654e4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        yw ywVar = dyVar.B3;
        if (ywVar != null) {
            r0.j0.b(ywVar, m1Var);
        }
        return r0.m1.f46928b;
    }

    @Override
    public boolean a(int i9, View view) {
        dy.m0(this.f39634b, i9);
        return false;
    }

    @Override
    public void b() {
        dy dyVar = this.f39634b;
        dyVar.M = true;
        dyVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jv.c(float, float, int, android.view.View):void");
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f39633a) {
            case 6:
                dy.e0(this.f39634b);
                return;
            case 7:
            default:
                dy dyVar = this.f39634b;
                dyVar.getMessagesController().hidePromoDialog();
                dyVar.b4(false);
                return;
            case 8:
                dy dyVar2 = this.f39634b;
                dyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            dyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            dyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 9:
                dy dyVar3 = this.f39634b;
                dyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    dyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f39633a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g0(View view, float f10, float f11) {
        int i9 = this.f39633a;
    }

    public void h(int i9) {
        ow owVar = this.f39634b.f37746x1;
        if (owVar == null) {
            return;
        }
        if (i9 == 0) {
            owVar.p0(true);
        } else {
            owVar.x1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f39634b.W4(z10, arrayList, arrayList2, z11, true);
    }

    private final void d(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
