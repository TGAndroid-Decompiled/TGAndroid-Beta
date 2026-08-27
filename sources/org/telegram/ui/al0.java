package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

public final class al0 extends org.telegram.ui.Components.yk0 {

    public final Context f36560c;
    public final PasscodeActivity d;

    public al0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.f36560c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        return iB == passcodeActivity.fingerprintRow || iB == passcodeActivity.autoLockRow || iB == passcodeActivity.F || iB == passcodeActivity.changePasscodeRow || iB == passcodeActivity.disablePasscodeRow;
    }

    @Override
    public final int h() {
        return this.d.H;
    }

    @Override
    public final int j(int i10) {
        PasscodeActivity passcodeActivity = this.d;
        if (i10 == passcodeActivity.fingerprintRow || i10 == passcodeActivity.F) {
            return 0;
        }
        if (i10 == passcodeActivity.changePasscodeRow || i10 == passcodeActivity.autoLockRow || i10 == passcodeActivity.disablePasscodeRow) {
            return 1;
        }
        if (i10 == passcodeActivity.D || i10 == passcodeActivity.G || i10 == passcodeActivity.C) {
            return 2;
        }
        if (i10 == passcodeActivity.E) {
            return 3;
        }
        return i10 == 0 ? 4 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        PasscodeActivity passcodeActivity = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i10 == passcodeActivity.fingerprintRow) {
                p8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            } else {
                if (i10 == passcodeActivity.F) {
                    p8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                    bl0 bl0Var = (bl0) view;
                    bl0Var.f36850a.f(R.raw.utyan_passcode, 100, 100, null);
                    bl0Var.f36850a.d();
                    return;
                }
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                j4Var.setHeight(46);
                if (i10 == passcodeActivity.E) {
                    j4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == passcodeActivity.C) {
                x8Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                x8Var.setBackground(null);
                x8Var.getTextView().setGravity(1);
                return;
            } else if (i10 == passcodeActivity.D) {
                x8Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                x8Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                return;
            } else {
                if (i10 == passcodeActivity.G) {
                    x8Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    x8Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        if (i10 == passcodeActivity.changePasscodeRow) {
            x9Var.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i12 = org.telegram.ui.ActionBar.g6.E6;
                x9Var.setTag(Integer.valueOf(i12));
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                return;
            } else {
                int i13 = org.telegram.ui.ActionBar.g6.G6;
                x9Var.setTag(Integer.valueOf(i13));
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                return;
            }
        }
        if (i10 != passcodeActivity.autoLockRow) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                x9Var.b(LocaleController.getString(R.string.DisablePasscode), false);
                int i14 = org.telegram.ui.ActionBar.g6.f23284q7;
                x9Var.setTag(Integer.valueOf(i14));
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                return;
            }
            return;
        }
        int i15 = SharedConfig.autoLockIn;
        if (i15 == 0) {
            string = LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]);
        } else if (i15 < 3600) {
            string = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i15 / 60, new Object[0]));
        } else {
            string = i15 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i15 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i15 / 60.0f) / 60.0f) / 24.0f), new Object[0]));
        }
        x9Var.c(LocaleController.getString(R.string.AutoLock), string, false, true);
        int i16 = org.telegram.ui.ActionBar.g6.G6;
        x9Var.setTag(Integer.valueOf(i16));
        x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View p8Var;
        Context context = this.f36560c;
        if (i10 == 0) {
            p8Var = new org.telegram.ui.Cells.p8(context);
        } else if (i10 == 1) {
            p8Var = new org.telegram.ui.Cells.x9(context);
        } else if (i10 == 3) {
            p8Var = new org.telegram.ui.Cells.j4(context);
        } else if (i10 != 4) {
            p8Var = new org.telegram.ui.Cells.x8(context);
        } else {
            p8Var = new bl0(context);
            p8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.lk0(p8Var);
    }
}
