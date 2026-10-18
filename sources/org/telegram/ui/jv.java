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
public final class jv implements org.telegram.ui.Components.hr0, org.telegram.ui.Components.xl0, org.telegram.ui.Components.yl0, x00, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.kl0 {
    public final int f38358a;
    public final ey f38359b;

    public jv(ey eyVar, int i10) {
        this.f38358a = i10;
        this.f38359b = eyVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        ey eyVar = this.f38359b;
        eyVar.v.j(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        eyVar.f36663f4 = defaultWindowInsets.f12287b;
        eyVar.f36668g4 = defaultWindowInsets.d;
        int i10 = k1Var.f44873a.f(8).d;
        if (eyVar.f36673h4 != i10) {
            eyVar.f36673h4 = i10;
            eyVar.fragmentView.requestLayout();
        }
        eyVar.F0.setPadding(0, eyVar.f36663f4, 0, 0);
        eyVar.V4();
        for (UndoView undoView : eyVar.f36756y0) {
            if (undoView != null) {
                int i11 = eyVar.f36668g4 + eyVar.f36678i4;
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
        return r0.k1.f44872b;
    }

    @Override
    public boolean P0(View view) {
        switch (this.f38358a) {
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
        ey.G0(this.f38359b, i10);
        return false;
    }

    @Override
    public void a0(View view, float f7, float f10) {
        int i10 = this.f38358a;
    }

    @Override
    public void b() {
        ey eyVar = this.f38359b;
        eyVar.Q = true;
        eyVar.fragmentView.invalidate();
    }

    @Override
    public void d(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jv.d(float, float, int, android.view.View):void");
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38358a) {
            case 6:
                ey.g0(this.f38359b);
                return;
            case 7:
            default:
                ey eyVar = this.f38359b;
                eyVar.getMessagesController().hidePromoDialog();
                eyVar.Z3(false);
                return;
            case 8:
                ey eyVar2 = this.f38359b;
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
                ey eyVar3 = this.f38359b;
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
        ow owVar = this.f38359b.B1;
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
        this.f38359b.U4(z10, arrayList, arrayList2, z11, true);
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
