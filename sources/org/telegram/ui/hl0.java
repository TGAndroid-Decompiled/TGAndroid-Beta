package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class hl0 extends org.telegram.ui.Components.rl0 {
    public final Context f37411c;
    public final PasscodeActivity d;

    public hl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.f37411c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = m1Var.b();
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatString;
        int i15 = m1Var.f5879f;
        View view = m1Var.f5875a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 != 0) {
            if (i15 != 1) {
                int i16 = 3;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4) {
                            il0 il0Var = (il0) view;
                            il0Var.f37741a.f(R.raw.utyan_passcode, 100, 100, null);
                            il0Var.f37741a.d();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setHeight(46);
                    if (i10 == passcodeActivity.F) {
                        m4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 == passcodeActivity.D) {
                    a9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                    a9Var.setBackground(null);
                    a9Var.getTextView().setGravity(1);
                    return;
                } else if (i10 == passcodeActivity.E) {
                    a9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                    org.telegram.ui.Components.g90 textView = a9Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView.setGravity(i16);
                    return;
                } else if (i10 == passcodeActivity.H) {
                    a9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    org.telegram.ui.Components.g90 textView2 = a9Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView2.setGravity(i16);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 == i14) {
                        aaVar.b(LocaleController.getString(R.string.DisablePasscode), false);
                        int i17 = org.telegram.ui.ActionBar.k6.f21897q7;
                        aaVar.setTag(Integer.valueOf(i17));
                        aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
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
                aaVar.c(LocaleController.getString(R.string.AutoLock), formatString, false, true);
                int i19 = org.telegram.ui.ActionBar.k6.G6;
                aaVar.setTag(Integer.valueOf(i19));
                aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i19, false));
                return;
            }
            aaVar.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i20 = org.telegram.ui.ActionBar.k6.E6;
                aaVar.setTag(Integer.valueOf(i20));
                aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i20, false));
                return;
            }
            int i21 = org.telegram.ui.ActionBar.k6.G6;
            aaVar.setTag(Integer.valueOf(i21));
            aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i21, false));
            return;
        }
        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11) {
            s8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
        } else if (i10 == passcodeActivity.G) {
            s8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View s8Var;
        Context context = this.f37411c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        s8Var = new org.telegram.ui.Cells.a9(context);
                    } else {
                        s8Var = new il0(context);
                        s8Var.setTag(-33024);
                    }
                } else {
                    s8Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                s8Var = new org.telegram.ui.Cells.aa(context);
            }
        } else {
            s8Var = new org.telegram.ui.Cells.s8(context);
        }
        return new f2.m1(s8Var);
    }
}
