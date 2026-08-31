package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class kk0 extends org.telegram.ui.Components.sl0 {
    public final Context f38434c;
    public final NotificationsSettingsActivity d;

    public kk0(NotificationsSettingsActivity notificationsSettingsActivity, Context context) {
        this.d = notificationsSettingsActivity;
        this.f38434c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (b10 != notificationsSettingsActivity.f34204x && b10 != notificationsSettingsActivity.f34205y && b10 != notificationsSettingsActivity.B && b10 != notificationsSettingsActivity.H && b10 != notificationsSettingsActivity.J && b10 != notificationsSettingsActivity.P && b10 != notificationsSettingsActivity.K && b10 != notificationsSettingsActivity.I && b10 != notificationsSettingsActivity.O && b10 != notificationsSettingsActivity.C && b10 != notificationsSettingsActivity.D && b10 != notificationsSettingsActivity.L && b10 != notificationsSettingsActivity.f34201r && b10 != notificationsSettingsActivity.f34202s && b10 != notificationsSettingsActivity.Q && b10 != notificationsSettingsActivity.G) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.R;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i10 != notificationsSettingsActivity.H && i10 != notificationsSettingsActivity.J && i10 != notificationsSettingsActivity.P && i10 != notificationsSettingsActivity.D && i10 != notificationsSettingsActivity.K && i10 != notificationsSettingsActivity.B && i10 != notificationsSettingsActivity.f34204x && i10 != notificationsSettingsActivity.f34201r) {
            i11 = notificationsSettingsActivity.inappSoundRow;
            if (i10 != i11) {
                i12 = notificationsSettingsActivity.inappVibrateRow;
                if (i10 != i12 && i10 != notificationsSettingsActivity.f34203w) {
                    i13 = notificationsSettingsActivity.inappPreviewRow;
                    if (i10 != i13) {
                        i14 = notificationsSettingsActivity.contactJoinedRow;
                        if (i10 != i14) {
                            i15 = notificationsSettingsActivity.pinnedMessageRow;
                            if (i10 != i15 && i10 != notificationsSettingsActivity.v) {
                                i16 = notificationsSettingsActivity.badgeNumberMutedRow;
                                if (i10 != i16) {
                                    i17 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                    if (i10 != i17) {
                                        i18 = notificationsSettingsActivity.badgeNumberShowRow;
                                        if (i10 != i18) {
                                            i19 = notificationsSettingsActivity.inappPriorityRow;
                                            if (i10 != i19) {
                                                i20 = notificationsSettingsActivity.inchatSoundRow;
                                                if (i10 != i20 && i10 != notificationsSettingsActivity.M) {
                                                    i21 = notificationsSettingsActivity.accountsAllRow;
                                                    if (i10 != i21) {
                                                        i22 = notificationsSettingsActivity.resetNotificationsRow;
                                                        if (i10 != i22) {
                                                            i23 = notificationsSettingsActivity.privateRow;
                                                            if (i10 != i23) {
                                                                i24 = notificationsSettingsActivity.groupRow;
                                                                if (i10 != i24) {
                                                                    i25 = notificationsSettingsActivity.channelsRow;
                                                                    if (i10 != i25) {
                                                                        i26 = notificationsSettingsActivity.storiesRow;
                                                                        if (i10 != i26) {
                                                                            i27 = notificationsSettingsActivity.reactionsRow;
                                                                            if (i10 != i27) {
                                                                                if (i10 != notificationsSettingsActivity.G && i10 != notificationsSettingsActivity.f34205y && i10 != notificationsSettingsActivity.I && i10 != notificationsSettingsActivity.O && i10 != notificationsSettingsActivity.C && i10 != notificationsSettingsActivity.L && i10 != notificationsSettingsActivity.Q) {
                                                                                    if (i10 == notificationsSettingsActivity.f34202s) {
                                                                                        return 6;
                                                                                    }
                                                                                    return 5;
                                                                                }
                                                                                return 4;
                                                                            }
                                                                            return 3;
                                                                        }
                                                                        return 3;
                                                                    }
                                                                    return 3;
                                                                }
                                                                return 3;
                                                            }
                                                            return 3;
                                                        }
                                                        return 2;
                                                    }
                                                    return 1;
                                                }
                                                return 1;
                                            }
                                            return 1;
                                        }
                                        return 1;
                                    }
                                    return 1;
                                }
                                return 1;
                            }
                            return 1;
                        }
                        return 1;
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
    public final void v(f2.m1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kk0.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        Context context = this.f38434c;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.m4(context, g6Var);
        } else if (i10 == 1) {
            g6Var2 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.s8(context, g6Var2);
        } else if (i10 != 2) {
            if (i10 == 3) {
                g6Var3 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.f38434c, g6Var3, true);
            } else if (i10 != 4) {
                if (i10 != 5) {
                    g6Var5 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
                    m4Var = new org.telegram.ui.Cells.a9(context, g6Var5);
                } else {
                    g6Var4 = ((org.telegram.ui.ActionBar.p2) notificationsSettingsActivity).resourceProvider;
                    m4Var = new org.telegram.ui.Cells.aa(context, 0, g6Var4);
                }
            } else {
                m4Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
        } else {
            m4Var = new org.telegram.ui.Cells.z8(context);
        }
        return new f2.m1(m4Var);
    }
}
