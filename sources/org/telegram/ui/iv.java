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
public final class iv implements org.telegram.ui.Components.pr0, org.telegram.ui.Components.am0, org.telegram.ui.Components.bm0, x00, org.telegram.ui.ActionBar.b2, oi.m, r0.n, oi.n, org.telegram.ui.Components.ol0 {
    public final int f40358a;
    public final cy f40359b;

    public iv(cy cyVar, int i10) {
        this.f40358a = i10;
        this.f40359b = cyVar;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        cy cyVar = this.f40359b;
        cyVar.v.j(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        cyVar.f38596f4 = defaultWindowInsets.f13451b;
        cyVar.f38601g4 = defaultWindowInsets.d;
        int i10 = k1Var.f47118a.f(8).d;
        if (cyVar.f38606h4 != i10) {
            cyVar.f38606h4 = i10;
            cyVar.fragmentView.requestLayout();
        }
        cyVar.F0.setPadding(0, cyVar.f38596f4, 0, 0);
        cyVar.g5();
        for (UndoView undoView : cyVar.f38690y0) {
            if (undoView != null) {
                int i11 = cyVar.f38601g4 + cyVar.f38611i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        tw twVar = cyVar.G3;
        if (twVar != null) {
            r0.i0.b(twVar, k1Var);
        }
        return r0.k1.f47117b;
    }

    @Override
    public boolean c(int i10, View view) {
        cy.m0(this.f40359b, i10);
        return false;
    }

    @Override
    public boolean c1(View view) {
        switch (this.f40358a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d() {
        cy cyVar = this.f40359b;
        cyVar.Q = true;
        cyVar.fragmentView.invalidate();
    }

    @Override
    public void e(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.e(float, float, int, android.view.View):void");
    }

    @Override
    public int f() {
        cy cyVar = this.f40359b;
        cyVar.getClass();
        return cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40358a) {
            case 6:
                cy.f0(this.f40359b);
                return;
            case 7:
            case 8:
            default:
                cy cyVar = this.f40359b;
                cyVar.getMessagesController().hidePromoDialog();
                cyVar.j4(false);
                return;
            case 9:
                cy cyVar2 = this.f40359b;
                cyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            cyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            cyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 10:
                cy cyVar3 = this.f40359b;
                cyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    cyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void i(int i10) {
        jw jwVar = this.f40359b.B1;
        if (jwVar == null) {
            return;
        }
        if (i10 == 0) {
            jwVar.n0(true);
        } else {
            jwVar.u1(true, false);
        }
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f40359b.f5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void k(int i10) {
        cy.z0(this.f40359b, i10);
    }

    @Override
    public void l0(View view, float f7, float f10) {
        int i10 = this.f40358a;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
