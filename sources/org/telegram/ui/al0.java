package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class al0 extends org.telegram.ui.Components.vk0 {
    public final Context f36517c;
    public final PasscodeActivity d;

    public al0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.f36517c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int b10 = q1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i9 = passcodeActivity.fingerprintRow;
        if (b10 != i9) {
            i10 = passcodeActivity.autoLockRow;
            if (b10 != i10 && b10 != passcodeActivity.F) {
                i11 = passcodeActivity.changePasscodeRow;
                if (b10 != i11) {
                    i12 = passcodeActivity.disablePasscodeRow;
                    if (b10 != i12) {
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
        return this.d.H;
    }

    @Override
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (i9 != i10 && i9 != passcodeActivity.F) {
            i11 = passcodeActivity.changePasscodeRow;
            if (i9 != i11) {
                i12 = passcodeActivity.autoLockRow;
                if (i9 != i12) {
                    i13 = passcodeActivity.disablePasscodeRow;
                    if (i9 != i13) {
                        if (i9 != passcodeActivity.D && i9 != passcodeActivity.G && i9 != passcodeActivity.C) {
                            if (i9 == passcodeActivity.E) {
                                return 3;
                            }
                            if (i9 == 0) {
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
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        String formatString;
        int i14 = q1Var.f5505f;
        View view = q1Var.f5501a;
        PasscodeActivity passcodeActivity = this.d;
        if (i14 != 0) {
            if (i14 != 1) {
                int i15 = 3;
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 4) {
                            bl0 bl0Var = (bl0) view;
                            bl0Var.f36902a.f(R.raw.utyan_passcode, 100, 100, null);
                            bl0Var.f36902a.d();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setHeight(46);
                    if (i9 == passcodeActivity.E) {
                        m4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 == passcodeActivity.C) {
                    b9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                    b9Var.setBackground(null);
                    b9Var.getTextView().setGravity(1);
                    return;
                } else if (i9 == passcodeActivity.D) {
                    b9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                    org.telegram.ui.Components.l80 textView = b9Var.getTextView();
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    }
                    textView.setGravity(i15);
                    return;
                } else if (i9 == passcodeActivity.G) {
                    b9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    org.telegram.ui.Components.l80 textView2 = b9Var.getTextView();
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    }
                    textView2.setGravity(i15);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            i11 = passcodeActivity.changePasscodeRow;
            if (i9 != i11) {
                i12 = passcodeActivity.autoLockRow;
                if (i9 != i12) {
                    i13 = passcodeActivity.disablePasscodeRow;
                    if (i9 == i13) {
                        baVar.b(LocaleController.getString(R.string.DisablePasscode), false);
                        int i16 = org.telegram.ui.ActionBar.f6.f23230q7;
                        baVar.setTag(Integer.valueOf(i16));
                        baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                        return;
                    }
                    return;
                }
                int i17 = SharedConfig.autoLockIn;
                if (i17 == 0) {
                    formatString = LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]);
                } else if (i17 < 3600) {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i17 / 60, new Object[0]));
                } else if (i17 < 86400) {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i17 / 60.0f) / 60.0f), new Object[0]));
                } else {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i17 / 60.0f) / 60.0f) / 24.0f), new Object[0]));
                }
                baVar.c(LocaleController.getString(R.string.AutoLock), formatString, false, true);
                int i18 = org.telegram.ui.ActionBar.f6.G6;
                baVar.setTag(Integer.valueOf(i18));
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                return;
            }
            baVar.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i19 = org.telegram.ui.ActionBar.f6.E6;
                baVar.setTag(Integer.valueOf(i19));
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i19, false));
                return;
            }
            int i20 = org.telegram.ui.ActionBar.f6.G6;
            baVar.setTag(Integer.valueOf(i20));
            baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i20, false));
            return;
        }
        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
        i10 = passcodeActivity.fingerprintRow;
        if (i9 == i10) {
            t8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
        } else if (i9 == passcodeActivity.F) {
            t8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View t8Var;
        Context context = this.f36517c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        t8Var = new org.telegram.ui.Cells.b9(context);
                    } else {
                        t8Var = new bl0(context);
                        t8Var.setTag(-33024);
                    }
                } else {
                    t8Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                t8Var = new org.telegram.ui.Cells.ba(context);
            }
        } else {
            t8Var = new org.telegram.ui.Cells.t8(context);
        }
        return new f2.q1(t8Var);
    }
}
