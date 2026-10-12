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
public final class aw implements org.telegram.ui.Components.nr0, org.telegram.ui.Components.bm0, org.telegram.ui.Components.cm0, t10, org.telegram.ui.ActionBar.z1, r0.o, org.telegram.ui.Components.ol0 {
    public final int f34359a;
    public final yy f34360b;

    public aw(yy yyVar, int i10) {
        this.f34359a = i10;
        this.f34360b = yyVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        yy yyVar = this.f34360b;
        yyVar.v.j(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        yyVar.f42329e4 = defaultWindowInsets.f10889b;
        yyVar.f42335f4 = defaultWindowInsets.d;
        int i10 = l1Var.f43741a.f(8).d;
        if (yyVar.f42340g4 != i10) {
            yyVar.f42340g4 = i10;
            yyVar.fragmentView.requestLayout();
        }
        yyVar.F0.setPadding(0, yyVar.f42329e4, 0, 0);
        yyVar.U4();
        for (UndoView undoView : yyVar.f42427y0) {
            if (undoView != null) {
                int i11 = yyVar.f42335f4 + yyVar.f42345h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        sx sxVar = yyVar.F3;
        if (sxVar != null) {
            r0.j0.b(sxVar, l1Var);
        }
        return r0.l1.f43740b;
    }

    @Override
    public boolean a(int i10, View view) {
        yy.m0(this.f34360b, i10);
        return false;
    }

    @Override
    public void c() {
        yy yyVar = this.f34360b;
        yyVar.Q = true;
        yyVar.fragmentView.invalidate();
    }

    @Override
    public boolean c1(View view) {
        switch (this.f34359a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aw.d(float, float, int, android.view.View):void");
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34359a) {
            case 6:
                yy.d0(this.f34360b);
                return;
            case 7:
            default:
                yy yyVar = this.f34360b;
                yyVar.getMessagesController().hidePromoDialog();
                yyVar.Y3(false);
                return;
            case 8:
                yy yyVar2 = this.f34360b;
                yyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            yyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            yyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 9:
                yy yyVar3 = this.f34360b;
                yyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    yyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        ix ixVar = this.f34360b.B1;
        if (ixVar == null) {
            return;
        }
        if (i10 == 0) {
            ixVar.o0(true);
        } else {
            ixVar.v1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f34360b.T4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f34359a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
