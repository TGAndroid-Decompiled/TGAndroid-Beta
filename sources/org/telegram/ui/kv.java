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
public final class kv implements org.telegram.ui.Components.qr0, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0, z00, org.telegram.ui.ActionBar.b2, oi.m, r0.n, oi.n, org.telegram.ui.Components.pl0 {
    public final int f40922a;
    public final ey f40923b;

    public kv(ey eyVar, int i10) {
        this.f40922a = i10;
        this.f40923b = eyVar;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        ey eyVar = this.f40923b;
        eyVar.v.j(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        eyVar.f39008f4 = defaultWindowInsets.f13450b;
        eyVar.f39013g4 = defaultWindowInsets.d;
        int i10 = k1Var.f47153a.f(8).d;
        if (eyVar.f39018h4 != i10) {
            eyVar.f39018h4 = i10;
            eyVar.fragmentView.requestLayout();
        }
        eyVar.F0.setPadding(0, eyVar.f39008f4, 0, 0);
        eyVar.g5();
        for (UndoView undoView : eyVar.f39102y0) {
            if (undoView != null) {
                int i11 = eyVar.f39013g4 + eyVar.f39023i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        vw vwVar = eyVar.G3;
        if (vwVar != null) {
            r0.i0.b(vwVar, k1Var);
        }
        return r0.k1.f47152b;
    }

    @Override
    public boolean c(int i10, View view) {
        ey.m0(this.f40923b, i10);
        return false;
    }

    @Override
    public boolean c1(View view) {
        switch (this.f40922a) {
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
        ey eyVar = this.f40923b;
        eyVar.Q = true;
        eyVar.fragmentView.invalidate();
    }

    @Override
    public void e(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kv.e(float, float, int, android.view.View):void");
    }

    @Override
    public int f() {
        ey eyVar = this.f40923b;
        eyVar.getClass();
        return eyVar.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40922a) {
            case 6:
                ey.f0(this.f40923b);
                return;
            case 7:
            case 8:
            default:
                ey eyVar = this.f40923b;
                eyVar.getMessagesController().hidePromoDialog();
                eyVar.j4(false);
                return;
            case 9:
                ey eyVar2 = this.f40923b;
                eyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            eyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            eyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 10:
                ey eyVar3 = this.f40923b;
                eyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    eyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void i(int i10) {
        lw lwVar = this.f40923b.B1;
        if (lwVar == null) {
            return;
        }
        if (i10 == 0) {
            lwVar.m0(true);
        } else {
            lwVar.t1(true, false);
        }
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f40923b.f5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void k(int i10) {
        ey.z0(this.f40923b, i10);
    }

    @Override
    public void l0(View view, float f7, float f10) {
        int i10 = this.f40922a;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
