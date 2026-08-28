package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.SharedConfig;
public final class cu extends org.telegram.ui.Components.vk0 {
    public final Context f37327c;
    public final DataSettingsActivity d;

    public cu(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.f37327c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = q1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.f35457e && b10 != dataSettingsActivity.f35458f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.f35461s) {
            i9 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i9 && b10 != dataSettingsActivity.v) {
                i10 = dataSettingsActivity.proxyRow;
                if (b10 != i10) {
                    i11 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i11 && b10 != dataSettingsActivity.A && b10 != dataSettingsActivity.f35464y && b10 != dataSettingsActivity.B && b10 != dataSettingsActivity.C && b10 != dataSettingsActivity.J && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.F && b10 != dataSettingsActivity.f35459n) {
                        i12 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (b10 != i12) {
                            i13 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (b10 != i13) {
                                i14 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (b10 != i14) {
                                    i15 = dataSettingsActivity.resetDownloadRow;
                                    if (b10 != i15) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
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
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i9 != dataSettingsActivity.f35460r && i9 != dataSettingsActivity.f35462w && i9 != dataSettingsActivity.K && i9 != dataSettingsActivity.M && i9 != dataSettingsActivity.H && i9 != dataSettingsActivity.N && i9 != dataSettingsActivity.P) {
            if (i9 != dataSettingsActivity.d && i9 != dataSettingsActivity.f35463x && i9 != dataSettingsActivity.I && i9 != 0 && i9 != dataSettingsActivity.L && i9 != dataSettingsActivity.E && i9 != dataSettingsActivity.O) {
                if (i9 != dataSettingsActivity.A && i9 != dataSettingsActivity.f35464y && i9 != dataSettingsActivity.B && i9 != dataSettingsActivity.C && i9 != dataSettingsActivity.F && i9 != dataSettingsActivity.G) {
                    if (i9 == dataSettingsActivity.D) {
                        return 4;
                    }
                    if (i9 != dataSettingsActivity.f35457e && i9 != dataSettingsActivity.h && i9 != dataSettingsActivity.f35458f) {
                        i10 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (i9 != i10) {
                            i11 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (i9 != i11) {
                                i12 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i9 != i12) {
                                    if (i9 != dataSettingsActivity.f35461s && i9 != dataSettingsActivity.v && i9 != dataSettingsActivity.f35459n) {
                                        return 1;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 5;
                        }
                        return 5;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cu.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View z6Var;
        Context context = this.f37327c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                z6Var = new org.telegram.ui.Cells.p8(context);
                            } else {
                                z6Var = new org.telegram.ui.Cells.j5(context);
                            }
                        } else {
                            z6Var = new org.telegram.ui.Cells.b9(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.t8(context);
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.m4(context, 22);
                }
            } else {
                z6Var = new org.telegram.ui.Cells.ba(context);
            }
        } else {
            z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        }
        return j3.r0.s(z6Var, z6Var, -1, -2);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        if (q1Var.f5505f == 3) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) q1Var.f5501a;
            int b10 = q1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.A) {
                t8Var.setChecked(SharedConfig.saveStreamMedia);
            } else if (b10 == dataSettingsActivity.f35464y) {
                t8Var.setChecked(SharedConfig.streamMedia);
            } else if (b10 == dataSettingsActivity.B) {
                t8Var.setChecked(SharedConfig.streamAllVideo);
            } else if (b10 == dataSettingsActivity.C) {
                t8Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.F) {
                t8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.G) {
                t8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
