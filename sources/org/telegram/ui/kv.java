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
public final class kv implements org.telegram.ui.Components.hq0, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, y00, org.telegram.ui.ActionBar.b2, r0.o, org.telegram.ui.Components.nk0 {
    public final int f40024a;
    public final fy f40025b;

    public kv(fy fyVar, int i10) {
        this.f40024a = i10;
        this.f40025b = fyVar;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        UndoView[] undoViewArr;
        fy fyVar = this.f40025b;
        fyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        fyVar.f38265b4 = defaultWindowInsets.f8187b;
        fyVar.f38270c4 = defaultWindowInsets.d;
        int i10 = m1Var.f46843a.f(8).d;
        if (fyVar.f38275d4 != i10) {
            fyVar.f38275d4 = i10;
            fyVar.fragmentView.requestLayout();
        }
        fyVar.B0.setPadding(0, fyVar.f38265b4, 0, 0);
        fyVar.X4();
        for (UndoView undoView : fyVar.f38358u0) {
            if (undoView != null) {
                int i11 = fyVar.f38270c4 + fyVar.f38281e4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        ax axVar = fyVar.B3;
        if (axVar != null) {
            r0.j0.b(axVar, m1Var);
        }
        return r0.m1.f46842b;
    }

    @Override
    public void a() {
        fy fyVar = this.f40025b;
        fyVar.M = true;
        fyVar.fragmentView.invalidate();
    }

    @Override
    public void b(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kv.b(float, float, int, android.view.View):void");
    }

    @Override
    public boolean b1(View view) {
        switch (this.f40024a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        fy.n0(this.f40025b, i10);
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40024a) {
            case 6:
                fy.f0(this.f40025b);
                return;
            case 7:
            default:
                fy fyVar = this.f40025b;
                fyVar.getMessagesController().hidePromoDialog();
                fyVar.b4(false);
                return;
            case 8:
                fy fyVar2 = this.f40025b;
                fyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            fyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            fyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 9:
                fy fyVar3 = this.f40025b;
                fyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    fyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    public void h(int i10) {
        qw qwVar = this.f40025b.f38373x1;
        if (qwVar == null) {
            return;
        }
        if (i10 == 0) {
            qwVar.q0(true);
        } else {
            qwVar.x1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f40025b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void o0(View view, float f9, float f10) {
        int i10 = this.f40024a;
    }

    private final void d(View view, float f9, float f10) {
    }

    private final void e(View view, float f9, float f10) {
    }

    private final void f(View view, float f9, float f10) {
    }
}
