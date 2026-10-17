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
public final class iv implements org.telegram.ui.Components.hr0, org.telegram.ui.Components.xl0, org.telegram.ui.Components.yl0, x00, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.kl0 {
    public final int f37986a;
    public final ey f37987b;

    public iv(ey eyVar, int i10) {
        this.f37986a = i10;
        this.f37987b = eyVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        ey eyVar = this.f37987b;
        eyVar.v.j(k1Var);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        eyVar.f36640f4 = defaultWindowInsets.f12285b;
        eyVar.f36645g4 = defaultWindowInsets.d;
        int i10 = k1Var.f44853a.f(8).d;
        if (eyVar.f36650h4 != i10) {
            eyVar.f36650h4 = i10;
            eyVar.fragmentView.requestLayout();
        }
        eyVar.F0.setPadding(0, eyVar.f36640f4, 0, 0);
        eyVar.V4();
        for (UndoView undoView : eyVar.f36733y0) {
            if (undoView != null) {
                int i11 = eyVar.f36645g4 + eyVar.f36655i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        yw ywVar = eyVar.G3;
        if (ywVar != null) {
            r0.i0.b(ywVar, k1Var);
        }
        return r0.k1.f44852b;
    }

    @Override
    public boolean P0(View view) {
        switch (this.f37986a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        ey.G0(this.f37987b, i10);
        return false;
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f37986a;
    }

    @Override
    public void b() {
        ey eyVar = this.f37987b;
        eyVar.Q = true;
        eyVar.fragmentView.invalidate();
    }

    @Override
    public void d(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.d(float, float, int, android.view.View):void");
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37986a) {
            case 6:
                ey.g0(this.f37987b);
                return;
            case 7:
            default:
                ey eyVar = this.f37987b;
                eyVar.getMessagesController().hidePromoDialog();
                eyVar.Z3(false);
                return;
            case 8:
                ey eyVar2 = this.f37987b;
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
            case 9:
                ey eyVar3 = this.f37987b;
                eyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    eyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        ow owVar = this.f37987b.B1;
        if (owVar == null) {
            return;
        }
        if (i10 == 0) {
            owVar.o0(true);
        } else {
            owVar.v1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f37987b.U4(z10, arrayList, arrayList2, z11, true);
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
