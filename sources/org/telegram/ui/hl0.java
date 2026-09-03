package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class hl0 extends org.telegram.ui.Components.ql0 {
    public final Context f34691c;
    public final PasscodeActivity d;

    public hl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.f34691c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = l1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 != i10) {
            i11 = passcodeActivity.autoLockRow;
            if (b10 != i11 && b10 != passcodeActivity.G) {
                i12 = passcodeActivity.changePasscodeRow;
                if (b10 != i12) {
                    i13 = passcodeActivity.disablePasscodeRow;
                    if (b10 != i13) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.I;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 != i11 && i10 != passcodeActivity.G) {
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 != i14) {
                        if (i10 != passcodeActivity.E && i10 != passcodeActivity.H && i10 != passcodeActivity.D) {
                            if (i10 == passcodeActivity.F) {
                                return 3;
                            }
                            if (i10 == 0) {
                                return 4;
                            }
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatString;
        int i15 = l1Var.f5777f;
        View view = l1Var.f5774a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 != 0) {
            if (i15 != 1) {
                int i16 = 3;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4) {
                            il0 il0Var = (il0) view;
                            il0Var.f34997a.f(R.raw.utyan_passcode, 100, 100, null);
                            il0Var.f34997a.d();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    l4Var.setHeight(46);
                    if (i10 == passcodeActivity.F) {
                        l4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i10 == passcodeActivity.D) {
                    z8Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                    z8Var.setBackground(null);
                    z8Var.getTextView().setGravity(1);
                    return;
                } else if (i10 == passcodeActivity.E) {
                    z8Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                    org.telegram.ui.Components.f90 textView = z8Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView.setGravity(i16);
                    return;
                } else if (i10 == passcodeActivity.H) {
                    z8Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    org.telegram.ui.Components.f90 textView2 = z8Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView2.setGravity(i16);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 == i14) {
                        z9Var.b(LocaleController.getString(R.string.DisablePasscode), false);
                        int i17 = org.telegram.ui.ActionBar.j6.f20116q7;
                        z9Var.setTag(Integer.valueOf(i17));
                        z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                        return;
                    }
                    return;
                }
                int i18 = SharedConfig.autoLockIn;
                if (i18 == 0) {
                    formatString = LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]);
                } else if (i18 < 3600) {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0]));
                } else if (i18 < 86400) {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0]));
                } else {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0]));
                }
                z9Var.c(LocaleController.getString(R.string.AutoLock), formatString, false, true);
                int i19 = org.telegram.ui.ActionBar.j6.G6;
                z9Var.setTag(Integer.valueOf(i19));
                z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                return;
            }
            z9Var.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i20 = org.telegram.ui.ActionBar.j6.E6;
                z9Var.setTag(Integer.valueOf(i20));
                z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
                return;
            }
            int i21 = org.telegram.ui.ActionBar.j6.G6;
            z9Var.setTag(Integer.valueOf(i21));
            z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11) {
            r8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
        } else if (i10 == passcodeActivity.G) {
            r8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View r8Var;
        Context context = this.f34691c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        r8Var = new org.telegram.ui.Cells.z8(context);
                    } else {
                        r8Var = new il0(context);
                        r8Var.setTag(-33024);
                    }
                } else {
                    r8Var = new org.telegram.ui.Cells.l4(context);
                }
            } else {
                r8Var = new org.telegram.ui.Cells.z9(context);
            }
        } else {
            r8Var = new org.telegram.ui.Cells.r8(context);
        }
        return new f2.l1(r8Var);
    }
}
