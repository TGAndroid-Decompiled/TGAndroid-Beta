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
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.b20;
import org.telegram.ui.fn0;
import org.telegram.ui.rt;
import org.telegram.ui.vl0;
import org.telegram.ui.wy;
import org.telegram.ui.x10;
import org.telegram.ui.zy;
public final class i1 implements View.OnTouchListener {
    public final int f19760a;
    public final Object f19761b;
    public final Object f19762c;

    public i1(int i10, Object obj, Object obj2) {
        this.f19760a = i10;
        this.f19761b = obj;
        this.f19762c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f19760a) {
            case 0:
                p1 p1Var = (p1) this.f19761b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19762c;
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
                b8 b8Var = (b8) this.f19761b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f19762c;
                if (motionEvent.getAction() == 0) {
                    c8 c8Var = b8Var.f23578n;
                    c8Var.E.r(c8Var.f23855n.T(xVar));
                    return false;
                }
                return false;
            case 2:
                return lv.m((lv) this.f19761b, (sm) this.f19762c, motionEvent);
            case 3:
                return qy0.a((qy0) this.f19761b, (org.telegram.ui.Components.k) this.f19762c, motionEvent);
            case 4:
                wy wyVar = (wy) this.f19761b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.f19762c;
                wyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    zy zyVar = wyVar.d;
                    zyVar.f40894c.r(zyVar.f40893b.T(f4Var));
                    return false;
                }
                return false;
            case 5:
                b20 b20Var = (b20) this.f19761b;
                x10 x10Var = (x10) this.f19762c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = b20Var.e;
                    filtersSetupActivity.f31573c.r(filtersSetupActivity.f31571a.T(x10Var));
                    return false;
                }
                return false;
            case 6:
                fn0 fn0Var = (fn0) this.f19761b;
                Context context = (Context) this.f19762c;
                int i15 = 0;
                if (fn0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder x10 = org.telegram.ui.Components.z4.x(context, i16, i15, i11, i17, i14, i13, string, z4, new e3.d(fn0Var, intValue, editTextBoldCursor, 12));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new vl0(0, fn0Var, editTextBoldCursor));
                        }
                        fn0Var.showDialog(x10.f19478a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
            default:
                ph.h1 h1Var = (ph.h1) this.f19761b;
                return rt.q().s(motionEvent, h1Var.f41735b, (dg.n) this.f19762c, h1Var.f41737f, ph.y1.H(h1Var.f41739r));
        }
    }
}
