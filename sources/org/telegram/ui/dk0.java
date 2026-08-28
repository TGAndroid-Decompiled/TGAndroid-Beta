package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class dk0 extends org.telegram.ui.Components.vk0 {
    public final Context f37557c;
    public final NotificationsSettingsActivity d;

    public dk0(NotificationsSettingsActivity notificationsSettingsActivity, Context context) {
        this.d = notificationsSettingsActivity;
        this.f37557c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (b10 != notificationsSettingsActivity.f35563x && b10 != notificationsSettingsActivity.f35564y && b10 != notificationsSettingsActivity.A && b10 != notificationsSettingsActivity.G && b10 != notificationsSettingsActivity.I && b10 != notificationsSettingsActivity.O && b10 != notificationsSettingsActivity.J && b10 != notificationsSettingsActivity.H && b10 != notificationsSettingsActivity.N && b10 != notificationsSettingsActivity.B && b10 != notificationsSettingsActivity.C && b10 != notificationsSettingsActivity.K && b10 != notificationsSettingsActivity.f35560r && b10 != notificationsSettingsActivity.f35561s && b10 != notificationsSettingsActivity.P && b10 != notificationsSettingsActivity.F) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i9) {
        int i10;
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
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i9 != notificationsSettingsActivity.G && i9 != notificationsSettingsActivity.I && i9 != notificationsSettingsActivity.O && i9 != notificationsSettingsActivity.C && i9 != notificationsSettingsActivity.J && i9 != notificationsSettingsActivity.A && i9 != notificationsSettingsActivity.f35563x && i9 != notificationsSettingsActivity.f35560r) {
            i10 = notificationsSettingsActivity.inappSoundRow;
            if (i9 != i10) {
                i11 = notificationsSettingsActivity.inappVibrateRow;
                if (i9 != i11 && i9 != notificationsSettingsActivity.f35562w) {
                    i12 = notificationsSettingsActivity.inappPreviewRow;
                    if (i9 != i12) {
                        i13 = notificationsSettingsActivity.contactJoinedRow;
                        if (i9 != i13) {
                            i14 = notificationsSettingsActivity.pinnedMessageRow;
                            if (i9 != i14 && i9 != notificationsSettingsActivity.v) {
                                i15 = notificationsSettingsActivity.badgeNumberMutedRow;
                                if (i9 != i15) {
                                    i16 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                    if (i9 != i16) {
                                        i17 = notificationsSettingsActivity.badgeNumberShowRow;
                                        if (i9 != i17) {
                                            i18 = notificationsSettingsActivity.inappPriorityRow;
                                            if (i9 != i18) {
                                                i19 = notificationsSettingsActivity.inchatSoundRow;
                                                if (i9 != i19 && i9 != notificationsSettingsActivity.L) {
                                                    i20 = notificationsSettingsActivity.accountsAllRow;
                                                    if (i9 != i20) {
                                                        i21 = notificationsSettingsActivity.resetNotificationsRow;
                                                        if (i9 != i21) {
                                                            i22 = notificationsSettingsActivity.privateRow;
                                                            if (i9 != i22) {
                                                                i23 = notificationsSettingsActivity.groupRow;
                                                                if (i9 != i23) {
                                                                    i24 = notificationsSettingsActivity.channelsRow;
                                                                    if (i9 != i24) {
                                                                        i25 = notificationsSettingsActivity.storiesRow;
                                                                        if (i9 != i25) {
                                                                            i26 = notificationsSettingsActivity.reactionsRow;
                                                                            if (i9 != i26) {
                                                                                if (i9 != notificationsSettingsActivity.F && i9 != notificationsSettingsActivity.f35564y && i9 != notificationsSettingsActivity.H && i9 != notificationsSettingsActivity.N && i9 != notificationsSettingsActivity.B && i9 != notificationsSettingsActivity.K && i9 != notificationsSettingsActivity.P) {
                                                                                    if (i9 == notificationsSettingsActivity.f35561s) {
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
    public final void v(f2.q1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dk0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        org.telegram.ui.ActionBar.b6 b6Var5;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        Context context = this.f37557c;
        if (i9 == 0) {
            b6Var = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.m4(context, b6Var);
        } else if (i9 == 1) {
            b6Var2 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
            m4Var = new org.telegram.ui.Cells.t8(context, b6Var2);
        } else if (i9 != 2) {
            if (i9 == 3) {
                b6Var3 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.f37557c, b6Var3, true);
            } else if (i9 != 4) {
                if (i9 != 5) {
                    b6Var5 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
                    m4Var = new org.telegram.ui.Cells.b9(context, b6Var5);
                } else {
                    b6Var4 = ((org.telegram.ui.ActionBar.o2) notificationsSettingsActivity).resourceProvider;
                    m4Var = new org.telegram.ui.Cells.ba(context, 0, b6Var4);
                }
            } else {
                m4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            }
        } else {
            m4Var = new org.telegram.ui.Cells.a9(context);
        }
        return new f2.q1(m4Var);
    }
}
