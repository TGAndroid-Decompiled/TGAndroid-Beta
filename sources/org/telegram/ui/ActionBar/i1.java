package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.dn0;
import org.telegram.ui.pt;
import org.telegram.ui.tl0;
import org.telegram.ui.uy;
import org.telegram.ui.v10;
import org.telegram.ui.xy;
import org.telegram.ui.z10;
public final class i1 implements View.OnTouchListener {
    public final int f19785a;
    public final Object f19786b;
    public final Object f19787c;

    public i1(int i10, Object obj, Object obj2) {
        this.f19785a = i10;
        this.f19786b = obj;
        this.f19787c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f19785a) {
            case 0:
                p1 p1Var = (p1) this.f19786b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19787c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        p1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 1:
                b8 b8Var = (b8) this.f19786b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f19787c;
                if (motionEvent.getAction() == 0) {
                    c8 c8Var = b8Var.f23591n;
                    c8Var.E.r(c8Var.f23900n.T(xVar));
                    return false;
                }
                return false;
            case 2:
                return mv.m((mv) this.f19786b, (tm) this.f19787c, motionEvent);
            case 3:
                return qy0.a((qy0) this.f19786b, (org.telegram.ui.Components.k) this.f19787c, motionEvent);
            case 4:
                uy uyVar = (uy) this.f19786b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f19787c;
                uyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    xy xyVar = uyVar.d;
                    xyVar.f40328c.r(xyVar.f40327b.T(g4Var));
                    return false;
                }
                return false;
            case 5:
                z10 z10Var = (z10) this.f19786b;
                v10 v10Var = (v10) this.f19787c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = z10Var.e;
                    filtersSetupActivity.f31599c.r(filtersSetupActivity.f31597a.T(v10Var));
                    return false;
                }
                return false;
            case 6:
                dn0 dn0Var = (dn0) this.f19786b;
                Context context = (Context) this.f19787c;
                int i15 = 0;
                if (dn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.get(1);
                    calendar.get(2);
                    calendar.get(5);
                    try {
                        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                        if (intValue == 8) {
                            string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                            i15 = 20;
                            i11 = 0;
                            i10 = 0;
                        } else {
                            i10 = -120;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i11 = -18;
                        }
                        boolean z4 = false;
                        String[] split = editTextBoldCursor.getText().toString().split("\\.");
                        if (split.length == 3) {
                            i12 = Utilities.parseInt((CharSequence) split[0]).intValue();
                            i14 = Utilities.parseInt((CharSequence) split[1]).intValue();
                            i13 = Utilities.parseInt((CharSequence) split[2]).intValue();
                        } else {
                            i12 = -1;
                            i13 = -1;
                            i14 = -1;
                        }
                        if (intValue == 8) {
                            z4 = true;
                        }
                        int i16 = i10;
                        int i17 = i12;
                        AlertDialog$Builder x10 = org.telegram.ui.Components.z4.x(context, i16, i15, i11, i17, i14, i13, string, z4, new e3.d(dn0Var, intValue, editTextBoldCursor, 12));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new tl0(0, dn0Var, editTextBoldCursor));
                        }
                        dn0Var.showDialog(x10.f19503a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
            default:
                ph.i1 i1Var = (ph.i1) this.f19786b;
                return pt.q().s(motionEvent, i1Var.f41733b, (dg.n) this.f19787c, i1Var.f41735f, ph.y1.H(i1Var.f41737r));
        }
    }
}
